.class public final synthetic Lu6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/f;->a:Lu6/b$a;

    iput p2, p0, Lu6/f;->b:I

    iput-boolean p3, p0, Lu6/f;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lu6/f;->a:Lu6/b$a;

    iget v1, p0, Lu6/f;->b:I

    iget-boolean v2, p0, Lu6/f;->c:Z

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, p1}, Lu6/n1;->L(Lu6/b$a;IZLu6/b;)V

    return-void
.end method
