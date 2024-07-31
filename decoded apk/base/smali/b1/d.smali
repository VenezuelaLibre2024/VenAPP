.class public abstract Lb1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lb1/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb1/d;
    .locals 1

    sget-object v0, Lb1/d;->a:Lb1/d;

    if-nez v0, :cond_0

    new-instance v0, Lb1/e;

    invoke-direct {v0}, Lb1/e;-><init>()V

    sput-object v0, Lb1/d;->a:Lb1/d;

    :cond_0
    sget-object v0, Lb1/d;->a:Lb1/d;

    return-object v0
.end method
