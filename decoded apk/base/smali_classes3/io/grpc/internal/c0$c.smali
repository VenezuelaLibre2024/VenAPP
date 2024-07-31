.class public final Lio/grpc/internal/c0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "c"
.end annotation


# instance fields
.field private a:Lvi/g1;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lvi/y0$c;

.field public d:Lvi/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/c0$a;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/c0$c;-><init>()V

    return-void
.end method

.method static synthetic a(Lio/grpc/internal/c0$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/c0$c;->b:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lio/grpc/internal/c0$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$c;->b:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lio/grpc/internal/c0$c;)Lvi/g1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/c0$c;->a:Lvi/g1;

    return-object p0
.end method

.method static synthetic d(Lio/grpc/internal/c0$c;Lvi/g1;)Lvi/g1;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$c;->a:Lvi/g1;

    return-object p1
.end method

.method static synthetic e(Lio/grpc/internal/c0$c;)Lvi/y0$c;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/c0$c;->c:Lvi/y0$c;

    return-object p0
.end method

.method static synthetic f(Lio/grpc/internal/c0$c;Lvi/y0$c;)Lvi/y0$c;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$c;->c:Lvi/y0$c;

    return-object p1
.end method
