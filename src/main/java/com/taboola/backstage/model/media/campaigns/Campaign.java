package com.taboola.backstage.model.media.campaigns;

import java.util.Date;

/**
 * Created by vladi
 * Date: 9/12/2017
 * Time: 11:22 PM
 * By Taboola
 */
public class Campaign {

    private String id;
    private String advertiserId;
    private String name;
    private String brandingText;
    private String trackingCode;
    private Double cpc;
    private Double dailyCap;
    private String dailyAdDeliveryMode;
    private PublisherBidModifier publisherBidModifier;
    private Double spendingLimit;
    private String spendingLimitModel;
    private CampaignTargeting countryTargeting;
    private CampaignTargeting subCountryTargeting;
    private CampaignTargeting platformTargeting;
    private CampaignTargeting publisherTargeting;
    private String comments;
    private Date startDate;
    private Date endDate;
    private String approvalState;
    private Boolean isActive;
    private Double spent;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandingText() {
        return brandingText;
    }

    public void setBrandingText(String brandingText) {
        this.brandingText = brandingText;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public Double getCpc() {
        return cpc;
    }

    public void setCpc(Double cpc) {
        this.cpc = cpc;
    }

    public Double getDailyCap() {
        return dailyCap;
    }

    public void setDailyCap(Double dailyCap) {
        this.dailyCap = dailyCap;
    }

    public String getDailyAdDeliveryMode() {
        return dailyAdDeliveryMode;
    }

    public void setDailyAdDeliveryMode(String dailyAdDeliveryMode) {
        this.dailyAdDeliveryMode = dailyAdDeliveryMode;
    }

    public PublisherBidModifier getPublisherBidModifier() {
        return publisherBidModifier;
    }

    public void setPublisherBidModifier(PublisherBidModifier publisherBidModifier) {
        this.publisherBidModifier = publisherBidModifier;
    }

    public Double getSpendingLimit() {
        return spendingLimit;
    }

    public void setSpendingLimit(Double spendingLimit) {
        this.spendingLimit = spendingLimit;
    }

    public String getSpendingLimitModel() {
        return spendingLimitModel;
    }

    public void setSpendingLimitModel(String spendingLimitModel) {
        this.spendingLimitModel = spendingLimitModel;
    }

    public CampaignTargeting getCountryTargeting() {
        return countryTargeting;
    }

    public void setCountryTargeting(CampaignTargeting countryTargeting) {
        this.countryTargeting = countryTargeting;
    }

    public CampaignTargeting getSubCountryTargeting() {
        return subCountryTargeting;
    }

    public void setSubCountryTargeting(CampaignTargeting subCountryTargeting) {
        this.subCountryTargeting = subCountryTargeting;
    }

    public CampaignTargeting getPlatformTargeting() {
        return platformTargeting;
    }

    public void setPlatformTargeting(CampaignTargeting platformTargeting) {
        this.platformTargeting = platformTargeting;
    }

    public CampaignTargeting getPublisherTargeting() {
        return publisherTargeting;
    }

    public void setPublisherTargeting(CampaignTargeting publisherTargeting) {
        this.publisherTargeting = publisherTargeting;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Double getSpent() {
        return spent;
    }

    public void setSpent(Double spent) {
        this.spent = spent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Campaign{" +
        "id=" + id +
        ", advertiserId='" + advertiserId + '\'' +
        ", name='" + name + '\'' +
        ", brandingText='" + brandingText + '\'' +
        ", trackingCode='" + trackingCode + '\'' +
        ", cpc=" + cpc +
        ", dailyCap=" + dailyCap +
        ", dailyAdDeliveryMode='" + dailyAdDeliveryMode + '\'' +
        ", publisherBidModifier=" + publisherBidModifier +
        ", spendingLimit=" + spendingLimit +
        ", spendingLimitModel='" + spendingLimitModel + '\'' +
        ", countryTargeting=" + countryTargeting +
        ", subCountryTargeting=" + subCountryTargeting +
        ", platformTargeting=" + platformTargeting +
        ", publisherTargeting=" + publisherTargeting +
        ", comments='" + comments + '\'' +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", approvalState='" + approvalState + '\'' +
        ", isActive=" + isActive +
        ", spent=" + spent +
        ", status='" + status + '\'' +
        '}';
    }
}