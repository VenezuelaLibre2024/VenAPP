.class public abstract Lx7/a;
.super Lx7/n;
.source "SourceFile"


# instance fields
.field public final k:J

.field public final l:J

.field private m:Lx7/c;

.field private n:[I


# direct methods
.method public constructor <init>(Ls8/j;Ls8/n;Lt6/u1;ILjava/lang/Object;JJJJJ)V
    .locals 13

    move-object v12, p0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p14

    invoke-direct/range {v0 .. v11}, Lx7/n;-><init>(Ls8/j;Ls8/n;Lt6/u1;ILjava/lang/Object;JJJ)V

    move-wide/from16 v0, p10

    iput-wide v0, v12, Lx7/a;->k:J

    move-wide/from16 v0, p12

    iput-wide v0, v12, Lx7/a;->l:J

    return-void
.end method


# virtual methods
.method public final i(I)I
    .locals 1

    iget-object v0, p0, Lx7/a;->n:[I

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aget p1, v0, p1

    return p1
.end method

.method protected final j()Lx7/c;
    .locals 1

    iget-object v0, p0, Lx7/a;->m:Lx7/c;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/c;

    return-object v0
.end method

.method public k(Lx7/c;)V
    .locals 0

    iput-object p1, p0, Lx7/a;->m:Lx7/c;

    invoke-virtual {p1}, Lx7/c;->a()[I

    move-result-object p1

    iput-object p1, p0, Lx7/a;->n:[I

    return-void
.end method
