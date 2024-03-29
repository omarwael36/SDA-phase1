<h1 align="center">Hi 👋, We are Dragons Team</h1>
<h3 align="center">A Team Software from Egypt</h3><br>
<h1 align="center">
        <img align="center" src="https://readme-typing-svg.herokuapp.com?font=Press+Start+2P&size=20&color=4DD421&lines=Hey!+We+are;Best+Software+developer" alt="Omar_Zenhom" />
        </h1>
<img alt="Night Coding" src="https://raw.githubusercontent.com/AVS1508/AVS1508/master/assets/Night-Coding.gif" align="right"/>
Software Design Phase 1
Fawry System
<img align="right" src="https://raw.githubusercontent.com/SubhadeepZilong/SubhadeepZilong/main/icons/animation_500_kxa883sd.gif" alt="Unfortunately I didn't find the author of the pic, feel to open a pull request if found" width="30%" />
<h1 align="center">Project overview 👋</h1>
<h3 align="center">Description 👋</h3> <br>
In this project you will work on building something similar to Fawry system. This system should 
be user by users to pay for different services. <br>The initial services are<br>
a. Mobile recharge services.<br>
i. Vodafone<br>
ii. Etisalat<br>
iii. Orange<br>
iv. We<br>
b. Internet Payment services.<br>
i. Vodafone<br>
ii. Etisalat<br>
iii. Orange<br>
iv. We<br>
c. Landline services<br>
i. Monthly receipt<br>
ii. Quarter receipt<br>
d. Donations<br>
i. Cancer Hospital<br>
ii. Schools<br>
iii. NGOs (Non profitable organizations)<br>
<h3 align="center">Requirements 👋</h3> <br>
# User <br>
1. The user should be able to signin to the system. Given the user’s email and a password, 
the user can login to the system and use any of the system functionalities.<br>
2. The user should be able to sign up to the system. The user should provide his 
username, email and password. The system should check if the username or the email 
is registered before, if they are not registered before then the signup process should 
complete successfully, if not, the system will show an error to the user<br>
3. The user should be able to search for any service in the system. The user can type the 
service name and the system will return all services that match the user query.<br>
4. The user can pay for any service in the system. The system should prompt the user to 
the payment form when the user asks to pay for any service. The default way is to pay 
via credit card. The system should allow the user to consume from the wallet (check 
Req.<br>
6) for this payment. If the service that should to receive the payment accepts cache 
on delivery, then this option should be visible too.<br>
5. The user can ask for a refund for any complete transaction to any given service. The 
refund request will be issued by the user and sent to the admin. If the admin approves 
the refund then the refund process should complete successfully. <br>
6. The system maintain a wallet balance for each user. The user should be able to add any 
funds to the wallet. Adding funds to the wallet should be done via credit card.<br>
7. The user should be able to check any discount for any service in the system. Discounts 
could be added by the admin (this will be discussed later).<br>
# Admin<br>
1. The admin should be able to add any new service provider to the system. Provider <br>
consists of a form to be sent to the user and a handler for this form. So for example 
Vodafone Cash provider consists of a form (Mobile number, amount) and a handler for 
this form (given the user answers to this form then provider will handle the user request). 
The form could consist of any number of field. The type of fields that are supported are 
text field and drop down field<br>
2. The admin should be able to add discounts to the system. There are two types of 
discounts.<br>
a. Overall discounts. For example the user should have 10% discount for the first 
transaction (regardless the service)<br>
b. Specific discount.. For example the admin can apply 20% discount for all mobile 
recharge services.<br>
For any given service. All overall discounts and specific discounts for this service should 
apply.<br>
3. The admin should be able to list all user transactions. The transactions types are<br>
a. Payment transaction.<br>
b. Add to wallet transaction.<br>
c. Refund transaction. <br>
4. The admin should be able to list all refund requests. Each refund request should contain 
the related service and the amount to be refunded. The admin should be able to accept 
or reject any refund request and if any refund request got accepted a refund transaction 
should be processed. <br>
Evaluation Criteria<br>
1. Properly working functionality as per the phase requirements.<br>
2. Quality of project configuration (i.e. actual realistic usage of Git throughout the 
phase development by all team members)<br>
3. Consistency between the various submitted system models.<br>
4. Consistency between the submitted system models, and the working product.<br>
5. Quality of the design in terms of its usage of appropriate design patterns.<br>
