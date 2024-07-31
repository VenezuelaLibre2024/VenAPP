.class public final Lgj/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lgj/b;
    .locals 1

    sget-object v0, Lkj/c;->INSTANCE:Lkj/c;

    return-object v0
.end method

.method public static b()Lgj/b;
    .locals 1

    sget-object v0, Llj/a;->b:Ljava/lang/Runnable;

    invoke-static {v0}, Lgj/c;->c(Ljava/lang/Runnable;)Lgj/b;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/Runnable;)Lgj/b;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lgj/e;

    invoke-direct {v0, p0}, Lgj/e;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method
