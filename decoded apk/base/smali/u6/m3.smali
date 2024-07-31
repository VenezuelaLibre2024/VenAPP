.class public final Lu6/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/m3$a;
    }
.end annotation


# static fields
.field public static final b:Lu6/m3;


# instance fields
.field private final a:Lu6/m3$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    new-instance v0, Lu6/m3;

    invoke-direct {v0}, Lu6/m3;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lu6/m3;

    sget-object v1, Lu6/m3$a;->b:Lu6/m3$a;

    invoke-direct {v0, v1}, Lu6/m3;-><init>(Lu6/m3$a;)V

    :goto_0
    sput-object v0, Lu6/m3;->b:Lu6/m3;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu6/m3;-><init>(Lu6/m3$a;)V

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/media/metrics/LogSessionId;)V
    .locals 1

    new-instance v0, Lu6/m3$a;

    invoke-direct {v0, p1}, Lu6/m3$a;-><init>(Landroid/media/metrics/LogSessionId;)V

    invoke-direct {p0, v0}, Lu6/m3;-><init>(Lu6/m3$a;)V

    return-void
.end method

.method private constructor <init>(Lu6/m3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/m3;->a:Lu6/m3$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lu6/m3;->a:Lu6/m3$a;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu6/m3$a;

    iget-object v0, v0, Lu6/m3$a;->a:Landroid/media/metrics/LogSessionId;

    return-object v0
.end method
