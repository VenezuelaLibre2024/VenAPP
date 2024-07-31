.class final Lb7/b;
.super Ly6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/b$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Ly6/t;IJJ)V
    .locals 16

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lb7/a;

    invoke-direct {v1, v0}, Lb7/a;-><init>(Ly6/t;)V

    new-instance v2, Lb7/b$b;

    const/4 v3, 0x0

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lb7/b$b;-><init>(Ly6/t;ILb7/b$a;)V

    invoke-virtual/range {p1 .. p1}, Ly6/t;->f()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    iget-wide v7, v0, Ly6/t;->j:J

    invoke-virtual/range {p1 .. p1}, Ly6/t;->d()J

    move-result-wide v13

    const/4 v9, 0x6

    iget v0, v0, Ly6/t;->c:I

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v15

    move-object/from16 v0, p0

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    invoke-direct/range {v0 .. v15}, Ly6/a;-><init>(Ly6/a$d;Ly6/a$f;JJJJJJI)V

    return-void
.end method
