.class public interface abstract Lz2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "location"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    const-string v0, "gps"

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "network"

    invoke-virtual {p1, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public abstract b(Lz2/a0;)V
.end method

.method public abstract c(Landroid/app/Activity;Lz2/e0;Ly2/a;)V
.end method

.method public abstract d(Lz2/e0;Ly2/a;)V
.end method

.method public abstract e(II)Z
.end method

.method public abstract f()V
.end method
