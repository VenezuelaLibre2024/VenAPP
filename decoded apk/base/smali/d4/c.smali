.class public abstract Ld4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld4/c$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ld4/c$a;)V
    .locals 0

    invoke-direct {p0}, Ld4/c;-><init>()V

    return-void
.end method

.method public static a()Ld4/c;
    .locals 1

    new-instance v0, Ld4/c$b;

    invoke-direct {v0}, Ld4/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method abstract b(Z)V
.end method

.method public abstract c()V
.end method
