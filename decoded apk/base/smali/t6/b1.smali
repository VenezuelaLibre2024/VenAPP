.class public final synthetic Lt6/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lt6/g3;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lt6/g3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/b1;->a:Lt6/g3;

    iput p2, p0, Lt6/b1;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt6/b1;->a:Lt6/g3;

    iget v1, p0, Lt6/b1;->b:I

    check-cast p1, Lt6/j3$d;

    invoke-static {v0, v1, p1}, Lt6/d1;->r0(Lt6/g3;ILt6/j3$d;)V

    return-void
.end method
