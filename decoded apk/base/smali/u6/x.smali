.class public final synthetic Lu6/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/x;->a:Lu6/b$a;

    iput p2, p0, Lu6/x;->b:I

    iput-wide p3, p0, Lu6/x;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lu6/x;->a:Lu6/b$a;

    iget v1, p0, Lu6/x;->b:I

    iget-wide v2, p0, Lu6/x;->c:J

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, v3, p1}, Lu6/n1;->t0(Lu6/b$a;IJLu6/b;)V

    return-void
.end method
