.class public final Lg9/b0;
.super Lg9/u;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lg9/u;-><init>(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final zzl(Landroid/os/Bundle;)V
    .locals 0

    const-string p1, "AdOverlayParcel is null or does not contain valid overlay type."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/u1;->a(Ljava/lang/String;)V

    const/4 p1, 0x4

    iput p1, p0, Lg9/u;->G:I

    iget-object p1, p0, Lg9/u;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
