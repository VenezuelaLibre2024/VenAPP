.class public final Lb8/g$b;
.super Lb8/g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final w:Z

.field public final x:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb8/g$d;JIJLx6/m;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 17

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-wide/from16 v11, p11

    move-wide/from16 v13, p13

    move/from16 v15, p15

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lb8/g$e;-><init>(Ljava/lang/String;Lb8/g$d;JIJLx6/m;Ljava/lang/String;Ljava/lang/String;JJZLb8/g$a;)V

    move/from16 v1, p16

    iput-boolean v1, v0, Lb8/g$b;->w:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lb8/g$b;->x:Z

    return-void
.end method


# virtual methods
.method public h(JI)Lb8/g$b;
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move/from16 v6, p3

    new-instance v19, Lb8/g$b;

    move-object/from16 v1, v19

    iget-object v2, v0, Lb8/g$e;->a:Ljava/lang/String;

    iget-object v3, v0, Lb8/g$e;->b:Lb8/g$d;

    iget-wide v4, v0, Lb8/g$e;->c:J

    iget-object v9, v0, Lb8/g$e;->f:Lx6/m;

    iget-object v10, v0, Lb8/g$e;->r:Ljava/lang/String;

    iget-object v11, v0, Lb8/g$e;->s:Ljava/lang/String;

    iget-wide v12, v0, Lb8/g$e;->t:J

    iget-wide v14, v0, Lb8/g$e;->u:J

    move-object/from16 p1, v1

    iget-boolean v1, v0, Lb8/g$e;->v:Z

    move/from16 v16, v1

    iget-boolean v1, v0, Lb8/g$b;->w:Z

    move/from16 v17, v1

    iget-boolean v1, v0, Lb8/g$b;->x:Z

    move/from16 v18, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v18}, Lb8/g$b;-><init>(Ljava/lang/String;Lb8/g$d;JIJLx6/m;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    return-object v19
.end method
