.class final Lcom/google/android/gms/ads/internal/client/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    const-string v0, "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time."

    return-object v0
.end method

.method public final getInitializationState()Le9/a$a;
    .locals 1

    sget-object v0, Le9/a$a;->READY:Le9/a$a;

    return-object v0
.end method

.method public final getLatency()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
