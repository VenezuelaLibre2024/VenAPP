.class public abstract Lcom/android/installreferrer/api/InstallReferrerClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/installreferrer/api/InstallReferrerClient$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lcom/android/installreferrer/api/InstallReferrerClient$b;
    .locals 2

    new-instance v0, Lcom/android/installreferrer/api/InstallReferrerClient$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/installreferrer/api/InstallReferrerClient$b;-><init>(Landroid/content/Context;Lcom/android/installreferrer/api/InstallReferrerClient$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()Lcom/android/installreferrer/api/ReferrerDetails;
.end method

.method public abstract d(Lcom/android/installreferrer/api/InstallReferrerStateListener;)V
.end method
