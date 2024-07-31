.class final Lt6/d1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lt6/d1;Z)Lu6/m3;
    .locals 0

    invoke-static {p0}, Lu6/k3;->A0(Landroid/content/Context;)Lu6/k3;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "ExoPlayerImpl"

    const-string p1, "MediaMetricsService unavailable."

    invoke-static {p0, p1}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lu6/m3;

    invoke-static {}, Lt6/e1;->a()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    invoke-direct {p0, p1}, Lu6/m3;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1, p0}, Lt6/d1;->U0(Lu6/b;)V

    :cond_1
    new-instance p1, Lu6/m3;

    invoke-virtual {p0}, Lu6/k3;->H0()Landroid/media/metrics/LogSessionId;

    move-result-object p0

    invoke-direct {p1, p0}, Lu6/m3;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p1
.end method
