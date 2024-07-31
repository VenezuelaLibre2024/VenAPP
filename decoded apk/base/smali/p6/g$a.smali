.class final Lp6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lp6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/g;

    invoke-direct {v0}, Lp6/g;-><init>()V

    sput-object v0, Lp6/g$a;->a:Lp6/g;

    return-void
.end method

.method static synthetic a()Lp6/g;
    .locals 1

    sget-object v0, Lp6/g$a;->a:Lp6/g;

    return-object v0
.end method
