.class final Lqd/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Lcom/google/protobuf/z$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqd/i$b;

    invoke-direct {v0}, Lqd/i$b;-><init>()V

    sput-object v0, Lqd/i$b;->a:Lcom/google/protobuf/z$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 0

    invoke-static {p1}, Lqd/i;->b(I)Lqd/i;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
