.class public final synthetic Lu6/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:I

.field public final synthetic c:Lt6/j3$e;

.field public final synthetic d:Lt6/j3$e;


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;ILt6/j3$e;Lt6/j3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/x0;->a:Lu6/b$a;

    iput p2, p0, Lu6/x0;->b:I

    iput-object p3, p0, Lu6/x0;->c:Lt6/j3$e;

    iput-object p4, p0, Lu6/x0;->d:Lt6/j3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lu6/x0;->a:Lu6/b$a;

    iget v1, p0, Lu6/x0;->b:I

    iget-object v2, p0, Lu6/x0;->c:Lt6/j3$e;

    iget-object v3, p0, Lu6/x0;->d:Lt6/j3$e;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, v3, p1}, Lu6/n1;->o0(Lu6/b$a;ILt6/j3$e;Lt6/j3$e;Lu6/b;)V

    return-void
.end method
