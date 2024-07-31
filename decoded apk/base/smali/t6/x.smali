.class public final Lt6/x;
.super Lt6/f3;
.source "SourceFile"


# static fields
.field public static final A:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final B:Ljava/lang/String;

.field private static final C:Ljava/lang/String;

.field private static final D:Ljava/lang/String;

.field private static final E:Ljava/lang/String;

.field private static final F:Ljava/lang/String;

.field private static final G:Ljava/lang/String;


# instance fields
.field public final t:I

.field public final u:Ljava/lang/String;

.field public final v:I

.field public final w:Lt6/u1;

.field public final x:I

.field public final y:Lv7/z;

.field final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt6/w;

    invoke-direct {v0}, Lt6/w;-><init>()V

    sput-object v0, Lt6/x;->A:Lt6/o$a;

    const/16 v0, 0x3e9

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/x;->B:Ljava/lang/String;

    const/16 v0, 0x3ea

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/x;->C:Ljava/lang/String;

    const/16 v0, 0x3eb

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/x;->D:Ljava/lang/String;

    const/16 v0, 0x3ec

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/x;->E:Ljava/lang/String;

    const/16 v0, 0x3ed

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/x;->F:Ljava/lang/String;

    const/16 v0, 0x3ee

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/x;->G:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(ILjava/lang/Throwable;I)V
    .locals 10

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v4, p3

    invoke-direct/range {v0 .. v9}, Lt6/x;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILt6/u1;IZ)V

    return-void
.end method

.method private constructor <init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILt6/u1;IZ)V
    .locals 14

    move v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    move/from16 v3, p6

    move-object/from16 v4, p7

    move/from16 v5, p8

    invoke-static/range {v0 .. v5}, Lt6/x;->k(ILjava/lang/String;Ljava/lang/String;ILt6/u1;I)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    move-object v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move v5, p1

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v13, p9

    invoke-direct/range {v1 .. v13}, Lt6/x;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILt6/u1;ILv7/z;JZ)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0, p1}, Lt6/f3;-><init>(Landroid/os/Bundle;)V

    sget-object v0, Lt6/x;->B:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lt6/x;->t:I

    sget-object v0, Lt6/x;->C:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lt6/x;->u:Ljava/lang/String;

    sget-object v0, Lt6/x;->D:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lt6/x;->v:I

    sget-object v0, Lt6/x;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sget-object v2, Lt6/u1;->A0:Lt6/o$a;

    invoke-interface {v2, v0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lt6/u1;

    :goto_0
    iput-object v0, p0, Lt6/x;->w:Lt6/u1;

    sget-object v0, Lt6/x;->F:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lt6/x;->x:I

    sget-object v0, Lt6/x;->G:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lt6/x;->z:Z

    iput-object v1, p0, Lt6/x;->y:Lv7/z;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILt6/u1;ILv7/z;JZ)V
    .locals 9

    move-object v6, p0

    move v7, p4

    move/from16 v8, p12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide/from16 v4, p10

    invoke-direct/range {v0 .. v5}, Lt6/f3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz v8, :cond_1

    if-ne v7, v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    invoke-static {v2}, Lt8/a;->a(Z)V

    if-nez p2, :cond_2

    const/4 v2, 0x3

    if-ne v7, v2, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput v7, v6, Lt6/x;->t:I

    move-object v0, p5

    iput-object v0, v6, Lt6/x;->u:Ljava/lang/String;

    move v0, p6

    iput v0, v6, Lt6/x;->v:I

    move-object/from16 v0, p7

    iput-object v0, v6, Lt6/x;->w:Lt6/u1;

    move/from16 v0, p8

    iput v0, v6, Lt6/x;->x:I

    move-object/from16 v0, p9

    iput-object v0, v6, Lt6/x;->y:Lv7/z;

    iput-boolean v8, v6, Lt6/x;->z:Z

    return-void
.end method

.method public static synthetic e(Landroid/os/Bundle;)Lt6/x;
    .locals 1

    new-instance v0, Lt6/x;

    invoke-direct {v0, p0}, Lt6/x;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static g(Ljava/lang/Throwable;Ljava/lang/String;ILt6/u1;IZI)Lt6/x;
    .locals 11

    new-instance v10, Lt6/x;

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-nez p3, :cond_0

    const/4 v0, 0x4

    move v8, v0

    goto :goto_0

    :cond_0
    move v8, p4

    :goto_0
    move-object v0, v10

    move-object v2, p0

    move/from16 v4, p6

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move/from16 v9, p5

    invoke-direct/range {v0 .. v9}, Lt6/x;-><init>(ILjava/lang/Throwable;Ljava/lang/String;ILjava/lang/String;ILt6/u1;IZ)V

    return-object v10
.end method

.method public static h(Ljava/io/IOException;I)Lt6/x;
    .locals 2

    new-instance v0, Lt6/x;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lt6/x;-><init>(ILjava/lang/Throwable;I)V

    return-object v0
.end method

.method public static i(Ljava/lang/RuntimeException;)Lt6/x;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/16 v0, 0x3e8

    invoke-static {p0, v0}, Lt6/x;->j(Ljava/lang/RuntimeException;I)Lt6/x;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/RuntimeException;I)Lt6/x;
    .locals 2

    new-instance v0, Lt6/x;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lt6/x;-><init>(ILjava/lang/Throwable;I)V

    return-object v0
.end method

.method private static k(ILjava/lang/String;Ljava/lang/String;ILt6/u1;I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 p2, 0x3

    if-eq p0, p2, :cond_0

    const-string p0, "Unexpected runtime error"

    goto :goto_0

    :cond_0
    const-string p0, "Remote error"

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " error, index="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", format="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", format_supported="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p5}, Lt8/r0;->X(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string p0, "Source error"

    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    invoke-super {p0}, Lt6/f3;->a()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lt6/x;->B:Ljava/lang/String;

    iget v2, p0, Lt6/x;->t:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lt6/x;->C:Ljava/lang/String;

    iget-object v2, p0, Lt6/x;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lt6/x;->D:Ljava/lang/String;

    iget v2, p0, Lt6/x;->v:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lt6/x;->w:Lt6/u1;

    if-eqz v1, :cond_0

    sget-object v2, Lt6/x;->E:Ljava/lang/String;

    invoke-virtual {v1}, Lt6/u1;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    sget-object v1, Lt6/x;->F:Ljava/lang/String;

    iget v2, p0, Lt6/x;->x:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lt6/x;->G:Ljava/lang/String;

    iget-boolean v2, p0, Lt6/x;->z:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method f(Lv7/z;)Lt6/x;
    .locals 14

    new-instance v13, Lt6/x;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    iget v3, p0, Lt6/f3;->a:I

    iget v4, p0, Lt6/x;->t:I

    iget-object v5, p0, Lt6/x;->u:Ljava/lang/String;

    iget v6, p0, Lt6/x;->v:I

    iget-object v7, p0, Lt6/x;->w:Lt6/u1;

    iget v8, p0, Lt6/x;->x:I

    iget-wide v10, p0, Lt6/f3;->b:J

    iget-boolean v12, p0, Lt6/x;->z:Z

    move-object v0, v13

    move-object v9, p1

    invoke-direct/range {v0 .. v12}, Lt6/x;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILt6/u1;ILv7/z;JZ)V

    return-object v13
.end method
