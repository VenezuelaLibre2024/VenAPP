.class public final synthetic Lu6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Lt6/u1;

.field public final synthetic c:Lw6/i;


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Lt6/u1;Lw6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/a0;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/a0;->b:Lt6/u1;

    iput-object p3, p0, Lu6/a0;->c:Lw6/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lu6/a0;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/a0;->b:Lt6/u1;

    iget-object v2, p0, Lu6/a0;->c:Lw6/i;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, p1}, Lu6/n1;->j0(Lu6/b$a;Lt6/u1;Lw6/i;Lu6/b;)V

    return-void
.end method
