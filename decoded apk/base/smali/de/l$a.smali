.class final Lde/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lde/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lde/l;

    invoke-direct {v0}, Lde/l;-><init>()V

    sput-object v0, Lde/l$a;->a:Lde/l;

    return-void
.end method

.method static synthetic a()Lde/l;
    .locals 1

    sget-object v0, Lde/l$a;->a:Lde/l;

    return-object v0
.end method
