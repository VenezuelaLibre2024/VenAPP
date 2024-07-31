.class public final Lt6/j3$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/j3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final A:Ljava/lang/String;

.field private static final B:Ljava/lang/String;

.field public static final C:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/j3$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final c:I

.field public final d:Lt6/c2;

.field public final e:Ljava/lang/Object;

.field public final f:I

.field public final r:J

.field public final s:J

.field public final t:I

.field public final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->v:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->w:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->x:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->y:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->z:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->A:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/j3$e;->B:Ljava/lang/String;

    new-instance v0, Lt6/l3;

    invoke-direct {v0}, Lt6/l3;-><init>()V

    sput-object v0, Lt6/j3$e;->C:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILt6/c2;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/j3$e;->a:Ljava/lang/Object;

    iput p2, p0, Lt6/j3$e;->b:I

    iput p2, p0, Lt6/j3$e;->c:I

    iput-object p3, p0, Lt6/j3$e;->d:Lt6/c2;

    iput-object p4, p0, Lt6/j3$e;->e:Ljava/lang/Object;

    iput p5, p0, Lt6/j3$e;->f:I

    iput-wide p6, p0, Lt6/j3$e;->r:J

    iput-wide p8, p0, Lt6/j3$e;->s:J

    iput p10, p0, Lt6/j3$e;->t:I

    iput p11, p0, Lt6/j3$e;->u:I

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/j3$e;
    .locals 0

    invoke-static {p0}, Lt6/j3$e;->c(Landroid/os/Bundle;)Lt6/j3$e;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Lt6/j3$e;
    .locals 14

    sget-object v0, Lt6/j3$e;->v:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    sget-object v0, Lt6/j3$e;->w:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Lt6/c2;->z:Lt6/o$a;

    invoke-interface {v2, v0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lt6/c2;

    :goto_0
    move-object v5, v0

    sget-object v0, Lt6/j3$e;->x:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    sget-object v0, Lt6/j3$e;->y:Ljava/lang/String;

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Lt6/j3$e;->z:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v0, Lt6/j3$e;->A:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    sget-object v0, Lt6/j3$e;->B:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    new-instance p0, Lt6/j3$e;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Lt6/j3$e;-><init>(Ljava/lang/Object;ILt6/c2;Ljava/lang/Object;IJJII)V

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v0}, Lt6/j3$e;->d(ZZ)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public d(ZZ)Landroid/os/Bundle;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/j3$e;->v:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget v3, p0, Lt6/j3$e;->c:I

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lt6/j3$e;->d:Lt6/c2;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    sget-object v3, Lt6/j3$e;->w:Ljava/lang/String;

    invoke-virtual {v1}, Lt6/c2;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    sget-object v1, Lt6/j3$e;->x:Ljava/lang/String;

    if-eqz p2, :cond_2

    iget v2, p0, Lt6/j3$e;->f:I

    :cond_2
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object p2, Lt6/j3$e;->y:Ljava/lang/String;

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_3

    iget-wide v3, p0, Lt6/j3$e;->r:J

    goto :goto_1

    :cond_3
    move-wide v3, v1

    :goto_1
    invoke-virtual {v0, p2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    sget-object p2, Lt6/j3$e;->z:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-wide v1, p0, Lt6/j3$e;->s:J

    :cond_4
    invoke-virtual {v0, p2, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    sget-object p2, Lt6/j3$e;->A:Ljava/lang/String;

    const/4 v1, -0x1

    if-eqz p1, :cond_5

    iget v2, p0, Lt6/j3$e;->t:I

    goto :goto_2

    :cond_5
    move v2, v1

    :goto_2
    invoke-virtual {v0, p2, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object p2, Lt6/j3$e;->B:Ljava/lang/String;

    if-eqz p1, :cond_6

    iget v1, p0, Lt6/j3$e;->u:I

    :cond_6
    invoke-virtual {v0, p2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lt6/j3$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lt6/j3$e;

    iget v2, p0, Lt6/j3$e;->c:I

    iget v3, p1, Lt6/j3$e;->c:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lt6/j3$e;->f:I

    iget v3, p1, Lt6/j3$e;->f:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lt6/j3$e;->r:J

    iget-wide v4, p1, Lt6/j3$e;->r:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/j3$e;->s:J

    iget-wide v4, p1, Lt6/j3$e;->s:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lt6/j3$e;->t:I

    iget v3, p1, Lt6/j3$e;->t:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lt6/j3$e;->u:I

    iget v3, p1, Lt6/j3$e;->u:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lt6/j3$e;->a:Ljava/lang/Object;

    iget-object v3, p1, Lt6/j3$e;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/j3$e;->e:Ljava/lang/Object;

    iget-object v3, p1, Lt6/j3$e;->e:Ljava/lang/Object;

    invoke-static {v2, v3}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/j3$e;->d:Lt6/c2;

    iget-object p1, p1, Lt6/j3$e;->d:Lt6/c2;

    invoke-static {v2, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lt6/j3$e;->a:Ljava/lang/Object;

    aput-object v2, v0, v1

    iget v1, p0, Lt6/j3$e;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    iget-object v2, p0, Lt6/j3$e;->d:Lt6/c2;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lt6/j3$e;->e:Ljava/lang/Object;

    aput-object v2, v0, v1

    iget v1, p0, Lt6/j3$e;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-wide v1, p0, Lt6/j3$e;->r:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-wide v1, p0, Lt6/j3$e;->s:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Lt6/j3$e;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Lt6/j3$e;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
