.class final Lud/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lud/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lud/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lud/k;

    invoke-direct {v0}, Lud/k;-><init>()V

    sput-object v0, Lud/k$a;->a:Lud/k;

    return-void
.end method

.method static synthetic a()Lud/k;
    .locals 1

    sget-object v0, Lud/k$a;->a:Lud/k;

    return-object v0
.end method
