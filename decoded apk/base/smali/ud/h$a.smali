.class final Lud/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lud/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lud/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lud/h;

    invoke-direct {v0}, Lud/h;-><init>()V

    sput-object v0, Lud/h$a;->a:Lud/h;

    return-void
.end method

.method static synthetic a()Lud/h;
    .locals 1

    sget-object v0, Lud/h$a;->a:Lud/h;

    return-object v0
.end method
