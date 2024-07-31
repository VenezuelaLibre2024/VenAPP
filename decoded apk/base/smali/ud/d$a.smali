.class final Lud/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lud/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lud/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lud/d;

    invoke-direct {v0}, Lud/d;-><init>()V

    sput-object v0, Lud/d$a;->a:Lud/d;

    return-void
.end method

.method static synthetic a()Lud/d;
    .locals 1

    sget-object v0, Lud/d$a;->a:Lud/d;

    return-object v0
.end method
