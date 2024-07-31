.class public final Lzk/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lzk/g1;
    .locals 2

    new-instance v0, Lzk/g;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lzk/g;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
