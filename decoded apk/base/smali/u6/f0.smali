.class public final synthetic Lu6/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/f0;->a:Lu6/b$a;

    iput p2, p0, Lu6/f0;->b:I

    iput p3, p0, Lu6/f0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lu6/f0;->a:Lu6/b$a;

    iget v1, p0, Lu6/f0;->b:I

    iget v2, p0, Lu6/f0;->c:I

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, p1}, Lu6/n1;->f0(Lu6/b$a;IILu6/b;)V

    return-void
.end method
