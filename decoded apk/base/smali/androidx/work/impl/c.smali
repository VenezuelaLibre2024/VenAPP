.class public final Landroidx/work/impl/c;
.super Lr1/u$b;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/work/impl/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/work/impl/c;

    invoke-direct {v0}, Landroidx/work/impl/c;-><init>()V

    sput-object v0, Landroidx/work/impl/c;->a:Landroidx/work/impl/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr1/u$b;-><init>()V

    return-void
.end method

.method private final e()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/work/impl/c;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Lv1/i;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lr1/u$b;->c(Lv1/i;)V

    invoke-interface {p1}, Lv1/i;->t()V

    :try_start_0
    invoke-direct {p0}, Landroidx/work/impl/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lv1/i;->x(Ljava/lang/String;)V

    invoke-interface {p1}, Lv1/i;->M()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lv1/i;->X()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Lv1/i;->X()V

    throw v0
.end method

.method public final d()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroidx/work/impl/z;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method
