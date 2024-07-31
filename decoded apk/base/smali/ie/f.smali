.class public abstract Lie/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie/f$a;,
        Lie/f$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lie/f$a;
    .locals 3

    new-instance v0, Lie/b$b;

    invoke-direct {v0}, Lie/b$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lie/b$b;->d(J)Lie/f$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Lie/f$b;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()J
.end method
