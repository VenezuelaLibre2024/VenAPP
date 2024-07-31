.class public final synthetic Lu6/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Lw6/e;


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Lw6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/c0;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/c0;->b:Lw6/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lu6/c0;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/c0;->b:Lw6/e;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, p1}, Lu6/n1;->H0(Lu6/b$a;Lw6/e;Lu6/b;)V

    return-void
.end method
