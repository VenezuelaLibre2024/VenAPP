.class public abstract Li6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li6/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Li6/g;
    .locals 4

    new-instance v0, Li6/b;

    sget-object v1, Li6/g$a;->FATAL_ERROR:Li6/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Li6/b;-><init>(Li6/g$a;J)V

    return-object v0
.end method

.method public static d()Li6/g;
    .locals 4

    new-instance v0, Li6/b;

    sget-object v1, Li6/g$a;->INVALID_PAYLOAD:Li6/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Li6/b;-><init>(Li6/g$a;J)V

    return-object v0
.end method

.method public static e(J)Li6/g;
    .locals 2

    new-instance v0, Li6/b;

    sget-object v1, Li6/g$a;->OK:Li6/g$a;

    invoke-direct {v0, v1, p0, p1}, Li6/b;-><init>(Li6/g$a;J)V

    return-object v0
.end method

.method public static f()Li6/g;
    .locals 4

    new-instance v0, Li6/b;

    sget-object v1, Li6/g$a;->TRANSIENT_ERROR:Li6/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Li6/b;-><init>(Li6/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Li6/g$a;
.end method
