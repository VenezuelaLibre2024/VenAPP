.class public abstract Le2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Le2/e;
    .locals 2

    const-string v0, "PROXY_OVERRIDE"

    invoke-static {v0}, Le2/t;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Le2/e$a;->a:Le2/e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Proxy override not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract a(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
.end method

.method public abstract c(Le2/d;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
.end method