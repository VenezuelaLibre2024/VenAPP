.class final Leb/i$b$a;
.super Leb/i$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Leb/i$b$b;-><init>(Leb/i$a;)V

    return-void
.end method

.method synthetic constructor <init>(Leb/i$a;)V
    .locals 0

    invoke-direct {p0}, Leb/i$b$a;-><init>()V

    return-void
.end method
