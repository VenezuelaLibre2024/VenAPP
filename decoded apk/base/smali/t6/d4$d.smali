.class public final Lt6/d4$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final C:Ljava/lang/Object;

.field private static final D:Ljava/lang/Object;

.field private static final E:Lt6/c2;

.field private static final F:Ljava/lang/String;

.field private static final G:Ljava/lang/String;

.field private static final H:Ljava/lang/String;

.field private static final I:Ljava/lang/String;

.field private static final J:Ljava/lang/String;

.field private static final K:Ljava/lang/String;

.field private static final L:Ljava/lang/String;

.field private static final M:Ljava/lang/String;

.field private static final N:Ljava/lang/String;

.field private static final O:Ljava/lang/String;

.field private static final P:Ljava/lang/String;

.field private static final Q:Ljava/lang/String;

.field private static final R:Ljava/lang/String;

.field public static final S:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/d4$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:I

.field public B:J

.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public c:Lt6/c2;

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:J

.field public r:J

.field public s:Z

.field public t:Z

.field public u:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public v:Lt6/c2$g;

.field public w:Z

.field public x:J

.field public y:J

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt6/d4$d;->C:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lt6/d4$d;->D:Ljava/lang/Object;

    new-instance v0, Lt6/c2$c;

    invoke-direct {v0}, Lt6/c2$c;-><init>()V

    const-string v1, "com.google.android.exoplayer2.Timeline"

    invoke-virtual {v0, v1}, Lt6/c2$c;->d(Ljava/lang/String;)Lt6/c2$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lt6/c2$c;->g(Landroid/net/Uri;)Lt6/c2$c;

    move-result-object v0

    invoke-virtual {v0}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->E:Lt6/c2;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->F:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->G:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->H:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->I:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->J:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->K:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->L:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->M:Ljava/lang/String;

    const/16 v0, 0x9

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->N:Ljava/lang/String;

    const/16 v0, 0xa

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->O:Ljava/lang/String;

    const/16 v0, 0xb

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->P:Ljava/lang/String;

    const/16 v0, 0xc

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->Q:Ljava/lang/String;

    const/16 v0, 0xd

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d4$d;->R:Ljava/lang/String;

    new-instance v0, Lt6/f4;

    invoke-direct {v0}, Lt6/f4;-><init>()V

    sput-object v0, Lt6/d4$d;->S:Lt6/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lt6/d4$d;->C:Ljava/lang/Object;

    iput-object v0, p0, Lt6/d4$d;->a:Ljava/lang/Object;

    sget-object v0, Lt6/d4$d;->E:Lt6/c2;

    iput-object v0, p0, Lt6/d4$d;->c:Lt6/c2;

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/d4$d;
    .locals 0

    invoke-static {p0}, Lt6/d4$d;->c(Landroid/os/Bundle;)Lt6/d4$d;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Lt6/d4$d;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lt6/d4$d;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lt6/c2;->z:Lt6/o$a;

    invoke-interface {v2, v1}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v1

    check-cast v1, Lt6/c2;

    goto :goto_0

    :cond_0
    sget-object v1, Lt6/c2;->t:Lt6/c2;

    :goto_0
    move-object v4, v1

    sget-object v1, Lt6/d4$d;->G:Ljava/lang/String;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v1, Lt6/d4$d;->H:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v1, Lt6/d4$d;->I:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v1, Lt6/d4$d;->J:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    sget-object v1, Lt6/d4$d;->K:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    sget-object v1, Lt6/d4$d;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v14, Lt6/c2$g;->w:Lt6/o$a;

    invoke-interface {v14, v1}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v1

    check-cast v1, Lt6/c2$g;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    move-object v14, v1

    sget-object v1, Lt6/d4$d;->M:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sget-object v15, Lt6/d4$d;->N:Ljava/lang/String;

    move-wide/from16 v23, v6

    const-wide/16 v5, 0x0

    invoke-virtual {v0, v15, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v15

    sget-object v7, Lt6/d4$d;->O:Ljava/lang/String;

    invoke-virtual {v0, v7, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v17

    sget-object v2, Lt6/d4$d;->P:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v19

    sget-object v2, Lt6/d4$d;->Q:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v20

    sget-object v2, Lt6/d4$d;->R:Ljava/lang/String;

    invoke-virtual {v0, v2, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v21

    new-instance v0, Lt6/d4$d;

    move-object v2, v0

    invoke-direct {v0}, Lt6/d4$d;-><init>()V

    sget-object v3, Lt6/d4$d;->D:Ljava/lang/Object;

    const/4 v5, 0x0

    move-wide/from16 v6, v23

    invoke-virtual/range {v2 .. v22}, Lt6/d4$d;->j(Ljava/lang/Object;Lt6/c2;Ljava/lang/Object;JJJZZLt6/c2$g;JJIIJ)Lt6/d4$d;

    iput-boolean v1, v0, Lt6/d4$d;->w:Z

    return-object v0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 8

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/c2;->t:Lt6/c2;

    iget-object v2, p0, Lt6/d4$d;->c:Lt6/c2;

    invoke-virtual {v1, v2}, Lt6/c2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lt6/d4$d;->F:Ljava/lang/String;

    iget-object v2, p0, Lt6/d4$d;->c:Lt6/c2;

    invoke-virtual {v2}, Lt6/c2;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget-wide v1, p0, Lt6/d4$d;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    sget-object v5, Lt6/d4$d;->G:Ljava/lang/String;

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    iget-wide v1, p0, Lt6/d4$d;->f:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    sget-object v5, Lt6/d4$d;->H:Ljava/lang/String;

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_2
    iget-wide v1, p0, Lt6/d4$d;->r:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    sget-object v5, Lt6/d4$d;->I:Ljava/lang/String;

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    iget-boolean v1, p0, Lt6/d4$d;->s:Z

    if-eqz v1, :cond_4

    sget-object v2, Lt6/d4$d;->J:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget-boolean v1, p0, Lt6/d4$d;->t:Z

    if-eqz v1, :cond_5

    sget-object v2, Lt6/d4$d;->K:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_5
    iget-object v1, p0, Lt6/d4$d;->v:Lt6/c2$g;

    if-eqz v1, :cond_6

    sget-object v2, Lt6/d4$d;->L:Ljava/lang/String;

    invoke-virtual {v1}, Lt6/c2$g;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    iget-boolean v1, p0, Lt6/d4$d;->w:Z

    if-eqz v1, :cond_7

    sget-object v2, Lt6/d4$d;->M:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_7
    iget-wide v1, p0, Lt6/d4$d;->x:J

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-eqz v7, :cond_8

    sget-object v7, Lt6/d4$d;->N:Ljava/lang/String;

    invoke-virtual {v0, v7, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_8
    iget-wide v1, p0, Lt6/d4$d;->y:J

    cmp-long v3, v1, v3

    if-eqz v3, :cond_9

    sget-object v3, Lt6/d4$d;->O:Ljava/lang/String;

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_9
    iget v1, p0, Lt6/d4$d;->z:I

    if-eqz v1, :cond_a

    sget-object v2, Lt6/d4$d;->P:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_a
    iget v1, p0, Lt6/d4$d;->A:I

    if-eqz v1, :cond_b

    sget-object v2, Lt6/d4$d;->Q:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_b
    iget-wide v1, p0, Lt6/d4$d;->B:J

    cmp-long v3, v1, v5

    if-eqz v3, :cond_c

    sget-object v3, Lt6/d4$d;->R:Ljava/lang/String;

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_c
    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$d;->r:J

    invoke-static {v0, v1}, Lt8/r0;->b0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$d;->x:J

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lt6/d4$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lt6/d4$d;

    iget-object v2, p0, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object v3, p1, Lt6/d4$d;->a:Ljava/lang/Object;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/d4$d;->c:Lt6/c2;

    iget-object v3, p1, Lt6/d4$d;->c:Lt6/c2;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/d4$d;->d:Ljava/lang/Object;

    iget-object v3, p1, Lt6/d4$d;->d:Ljava/lang/Object;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/d4$d;->v:Lt6/c2$g;

    iget-object v3, p1, Lt6/d4$d;->v:Lt6/c2$g;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lt6/d4$d;->e:J

    iget-wide v4, p1, Lt6/d4$d;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/d4$d;->f:J

    iget-wide v4, p1, Lt6/d4$d;->f:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/d4$d;->r:J

    iget-wide v4, p1, Lt6/d4$d;->r:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lt6/d4$d;->s:Z

    iget-boolean v3, p1, Lt6/d4$d;->s:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lt6/d4$d;->t:Z

    iget-boolean v3, p1, Lt6/d4$d;->t:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lt6/d4$d;->w:Z

    iget-boolean v3, p1, Lt6/d4$d;->w:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lt6/d4$d;->x:J

    iget-wide v4, p1, Lt6/d4$d;->x:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/d4$d;->y:J

    iget-wide v4, p1, Lt6/d4$d;->y:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lt6/d4$d;->z:I

    iget v3, p1, Lt6/d4$d;->z:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lt6/d4$d;->A:I

    iget v3, p1, Lt6/d4$d;->A:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lt6/d4$d;->B:J

    iget-wide v4, p1, Lt6/d4$d;->B:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$d;->x:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$d;->y:J

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lt6/d4$d;->B:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lt6/d4$d;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lt6/d4$d;->c:Lt6/c2;

    invoke-virtual {v0}, Lt6/c2;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lt6/d4$d;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lt6/d4$d;->v:Lt6/c2$g;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lt6/c2$g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/d4$d;->e:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/d4$d;->f:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/d4$d;->r:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Lt6/d4$d;->s:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Lt6/d4$d;->t:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Lt6/d4$d;->w:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/d4$d;->x:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/d4$d;->y:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lt6/d4$d;->z:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Lt6/d4$d;->A:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/d4$d;->B:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public i()Z
    .locals 4

    iget-boolean v0, p0, Lt6/d4$d;->u:Z

    iget-object v1, p0, Lt6/d4$d;->v:Lt6/c2$g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lt6/d4$d;->v:Lt6/c2$g;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    return v2
.end method

.method public j(Ljava/lang/Object;Lt6/c2;Ljava/lang/Object;JJJZZLt6/c2$g;JJIIJ)Lt6/d4$d;
    .locals 5

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p12

    move-object v3, p1

    iput-object v3, v0, Lt6/d4$d;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    sget-object v3, Lt6/d4$d;->E:Lt6/c2;

    :goto_0
    iput-object v3, v0, Lt6/d4$d;->c:Lt6/c2;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lt6/c2;->b:Lt6/c2$h;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lt6/c2$h;->h:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Lt6/d4$d;->b:Ljava/lang/Object;

    move-object v1, p3

    iput-object v1, v0, Lt6/d4$d;->d:Ljava/lang/Object;

    move-wide v3, p4

    iput-wide v3, v0, Lt6/d4$d;->e:J

    move-wide v3, p6

    iput-wide v3, v0, Lt6/d4$d;->f:J

    move-wide v3, p8

    iput-wide v3, v0, Lt6/d4$d;->r:J

    move v1, p10

    iput-boolean v1, v0, Lt6/d4$d;->s:Z

    move/from16 v1, p11

    iput-boolean v1, v0, Lt6/d4$d;->t:Z

    const/4 v1, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    iput-boolean v3, v0, Lt6/d4$d;->u:Z

    iput-object v2, v0, Lt6/d4$d;->v:Lt6/c2$g;

    move-wide/from16 v2, p13

    iput-wide v2, v0, Lt6/d4$d;->x:J

    move-wide/from16 v2, p15

    iput-wide v2, v0, Lt6/d4$d;->y:J

    move/from16 v2, p17

    iput v2, v0, Lt6/d4$d;->z:I

    move/from16 v2, p18

    iput v2, v0, Lt6/d4$d;->A:I

    move-wide/from16 v2, p19

    iput-wide v2, v0, Lt6/d4$d;->B:J

    iput-boolean v1, v0, Lt6/d4$d;->w:Z

    return-object v0
.end method
