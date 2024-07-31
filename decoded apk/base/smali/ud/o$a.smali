.class final Lud/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lud/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lud/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lud/o;

    invoke-direct {v0}, Lud/o;-><init>()V

    sput-object v0, Lud/o$a;->a:Lud/o;

    return-void
.end method

.method static synthetic a()Lud/o;
    .locals 1

    sget-object v0, Lud/o$a;->a:Lud/o;

    return-object v0
.end method
