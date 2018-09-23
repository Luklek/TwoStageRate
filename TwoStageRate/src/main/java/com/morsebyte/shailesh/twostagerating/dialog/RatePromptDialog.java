package com.morsebyte.shailesh.twostagerating.dialog;

/**
 * Created by Shailesh on 2/8/16.
 */
public class RatePromptDialog {

   public static  String ratePromptTitle = "How would you rate our app?";
    public static String ratePromptLaterText= "Remind me later";
    public static String ratePromptNeverText = "Never show again";
    public boolean dismissible = true;
    public void setDismissible(boolean dismissible)
    {
        this.dismissible = dismissible;
    }

    public boolean isDismissible()
    {
        return this.dismissible;
    }


    public void setTitle(String ratePromptTitle)
    {
        this.ratePromptTitle =ratePromptTitle;
    }
    public String getTitle( )
    {
        return this.ratePromptTitle;
    }


    public void setLaterText(String ratePromptLaterText)
    {
        this.ratePromptLaterText =ratePromptLaterText;
    }
    public String getLaterText( )
    {
        return this.ratePromptLaterText;
    }

    public void setNeverText(String ratePromptNeverText)
    {
        this.ratePromptNeverText =ratePromptNeverText;
    }
    public String getNeverText( )
    {
        return this.ratePromptNeverText;
    }



}
