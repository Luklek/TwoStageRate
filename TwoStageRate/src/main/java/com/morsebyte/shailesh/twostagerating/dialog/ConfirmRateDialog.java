package com.morsebyte.shailesh.twostagerating.dialog;

/**
 * Created by GuestHouser on 2/8/16.
 */
public class ConfirmRateDialog {

    public String confirmRateTitle = "Would you like to post your review on Google Play?";
    public String confirmRateText = "Thank you! We are very happy to hear that you love this theme. A nice review will help and motivate us a lot.";
    public String confirmRateNegativeText = "No Thanks";
    public String confirmRatePositiveText = "Yes!";
    public boolean dismissible = true;
    public void setDismissible(boolean dismissible)
    {
        this.dismissible = dismissible;
    }

    public boolean isDismissible()
    {
        return this.dismissible;
    }


    public void setTitle(String confirmRateTitle)
    {
        this.confirmRateTitle =confirmRateTitle;
    }
    public String getTitle( )
    {
        return this.confirmRateTitle;
    }

    public void setDescription(String confirmRateText)
    {
        this.confirmRateText =confirmRateText;
    }
    public String getDescription( )
    {
        return this.confirmRateText;
    }
    public void setNegativeText(String confirmRateNegativeText)
    {
        this.confirmRateNegativeText =confirmRateNegativeText;
    }
    public String getNegativeText( )
    {
        return this.confirmRateNegativeText;
    }
    public void setPositiveText(String confirmRatePositiveText)
    {
        this.confirmRatePositiveText =confirmRatePositiveText;
    }
    public String getPositiveText( )
    {
        return this.confirmRatePositiveText;
    }
}
