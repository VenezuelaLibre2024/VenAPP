.class public Lje/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/a;


# static fields
.field private static a:Lje/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lje/b;
    .locals 1

    sget-object v0, Lje/b;->a:Lje/b;

    if-nez v0, :cond_0

    new-instance v0, Lje/b;

    invoke-direct {v0}, Lje/b;-><init>()V

    sput-object v0, Lje/b;->a:Lje/b;

    :cond_0
    sget-object v0, Lje/b;->a:Lje/b;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
