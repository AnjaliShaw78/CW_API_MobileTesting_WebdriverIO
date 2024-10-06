describe('Contact Manager', () => {
    it.only('Explore',async () => {
        await driver.pause(5000);
        const app=await $("~Show Invisible Contacts (Only)");   // tap on Invisible Contacts to select option
        app.click();
        const app2=await $("~Show Invisible Contacts (Only)");   // tap on Invisible Contacts to deselect option
        app2.click();
        const app3=await $("~Add Contact");   // tap on add contact option
        app3.click();


        const element = await $('android=new UiSelector().resourceId("com.example.android.contactmanager:id/contactNameEditText")');
        await element.setValue('Anamika'); // To tap and write on Contact Name


        const element2 = await $('android=new UiSelector().resourceId("com.example.android.contactmanager:id/contactPhoneEditText")');
        await element2.setValue('9831389515'); // To tap and write on Contact   phone


        await $('android=new UiSelector().text("Home").instance(0)').click();  // To cick on Home 


        await $('android=new UiSelector().text("Work")').click();  //To click on Work option
        
        await $('android=new UiSelector().text("Work")').click(); //To click on Work option deselct it


        await $('android=new UiSelector().text("Mobile")').click(); //To tap on Mobile option


        await $('android=new UiSelector().text("Mobile")').click();// To tap and deselct the mobile option


        await $('android=new UiSelector().text("Other")').click(); //To tap and select on Other option


        const element3 = await $('android=new UiSelector().resourceId("com.example.android.contactmanager:id/contactEmailEditText")');
        await element3.setValue('shawanamika27@gmail.com');// To tap and write on Contact Email


        await $('android=new UiSelector().text("Home")').click(); //To tap on Home 


        await $('android=new UiSelector().text("Work")').click(); //To tap on Work 


        await $('android=new UiSelector().text("Work")').click(); //To tap on deselect the the work option


        await $('android=new UiSelector().text("Other")').click(); //To tap on and select Other option

        //To select save option
        await $('android=new UiSelector().resourceId("com.example.android.contactmanager:id/contactSaveButton")').click();

        // To open notification
        await driver.openNotifications();

        //To select the battery saver option
        const imageViews = await $$('android=new UiSelector().className("android.widget.ImageView")');
    await imageViews[4].click(); // Click on the 5th ImageView


    // Click the same element again to unclick battery saver option(assuming toggle behavior)
    await imageViews[4].click();


    // Press the BACK key
    await driver.pressKeyCode(4); // 4 is the Android Keycode for BACK


    // Press the HOME key
    await driver.pressKeyCode(3); // 3 is the Android Keycode for HOME


    //await driver.deleteSession();




        //new UiSelector().resourceId("com.example.android.contactmanager:id/contactSaveButton")




        //new UiSelector().text("Home")


        //new UiSelector().resourceId("com.example.android.contactmanager:id/contactEmailEditText")




       
    });
});
