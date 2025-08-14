import os
import smtplib
from email.message import EmailMessage

def send(sender, password, recipient, subject, body):
    msg = EmailMessage()
    msg.set_content(body)
    msg["Subject"] = subject
    msg["From"] = sender
    msg["To"] = recipient
    
    with smtplib.SMTP_SSL("smtp.gmail.com", 465) as s:
        s.login(sender, password)
        s.send_message(msg)

directory = input("Directory: ").strip()
login_file = input("Login File: ").strip()

with open(login_file, encoding="utf-8") as f:
    sender = f.readline().strip()
    password = f.readline().strip()

for file in os.listdir(directory):
    path = os.path.join(directory, file)
    if not (os.path.isfile(path) and file.endswith(".txt")):
        continue

    with open(path, encoding="utf-8") as fp:
        content = fp.read()
    
    print(f"\n=== {file} ===\n{content}\n")
    subject = input("Subject: ").strip()
    recipient = input("Recipient: ").strip()
    
    if recipient:
        try:
            send(sender, password, recipient, subject, content)
            print(f"\nSent '{file}' to {recipient}")
        except Exception as e:
            print(f"\nFailed to send '{subject}' to {recipient}: {e}")
