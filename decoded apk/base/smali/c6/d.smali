.class public Lc6/d;
.super Lc6/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Li9/y;Li9/e;Lc6/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/y;",
            "Li9/e<",
            "Li9/w;",
            "Li9/x;",
            ">;",
            "Lc6/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lc6/c;-><init>(Li9/y;Li9/e;Lc6/f;)V

    return-void
.end method


# virtual methods
.method b()Lcom/facebook/ads/AdExperienceType;
    .locals 1

    sget-object v0, Lcom/facebook/ads/AdExperienceType;->AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL:Lcom/facebook/ads/AdExperienceType;

    return-object v0
.end method
