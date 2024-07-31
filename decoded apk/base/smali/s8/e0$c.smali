.class public final Ls8/e0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:J


# direct methods
.method private constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls8/e0$c;->a:I

    iput-wide p2, p0, Ls8/e0$c;->b:J

    return-void
.end method

.method synthetic constructor <init>(IJLs8/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls8/e0$c;-><init>(IJ)V

    return-void
.end method

.method static synthetic a(Ls8/e0$c;)I
    .locals 0

    iget p0, p0, Ls8/e0$c;->a:I

    return p0
.end method

.method static synthetic b(Ls8/e0$c;)J
    .locals 2

    iget-wide v0, p0, Ls8/e0$c;->b:J

    return-wide v0
.end method


# virtual methods
.method public c()Z
    .locals 2

    iget v0, p0, Ls8/e0$c;->a:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method
