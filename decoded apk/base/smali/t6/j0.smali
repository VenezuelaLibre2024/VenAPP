.class public final synthetic Lt6/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt6/j3$e;

.field public final synthetic c:Lt6/j3$e;


# direct methods
.method public synthetic constructor <init>(ILt6/j3$e;Lt6/j3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt6/j0;->a:I

    iput-object p2, p0, Lt6/j0;->b:Lt6/j3$e;

    iput-object p3, p0, Lt6/j0;->c:Lt6/j3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lt6/j0;->a:I

    iget-object v1, p0, Lt6/j0;->b:Lt6/j3$e;

    iget-object v2, p0, Lt6/j0;->c:Lt6/j3$e;

    check-cast p1, Lt6/j3$d;

    invoke-static {v0, v1, v2, p1}, Lt6/d1;->h0(ILt6/j3$e;Lt6/j3$e;Lt6/j3$d;)V

    return-void
.end method
