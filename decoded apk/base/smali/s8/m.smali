.class public final Ls8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ls8/j;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ls8/j;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
