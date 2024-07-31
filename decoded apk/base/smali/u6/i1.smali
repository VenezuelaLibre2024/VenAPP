.class public final synthetic Lu6/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/i1;->a:Lu6/b$a;

    iput p2, p0, Lu6/i1;->b:I

    iput-wide p3, p0, Lu6/i1;->c:J

    iput-wide p5, p0, Lu6/i1;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lu6/i1;->a:Lu6/b$a;

    iget v1, p0, Lu6/i1;->b:I

    iget-wide v2, p0, Lu6/i1;->c:J

    iget-wide v4, p0, Lu6/i1;->d:J

    move-object v6, p1

    check-cast v6, Lu6/b;

    invoke-static/range {v0 .. v6}, Lu6/n1;->n0(Lu6/b$a;IJJLu6/b;)V

    return-void
.end method
