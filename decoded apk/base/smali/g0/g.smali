.class public final synthetic Lg0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/a;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Lw/x0;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Lw/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/g;->a:Lg0/u;

    iput-object p2, p0, Lg0/g;->b:Lw/x0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lg0/g;->a:Lg0/u;

    iget-object v1, p0, Lg0/g;->b:Lw/x0;

    check-cast p1, Lw/x0$a;

    invoke-static {v0, v1, p1}, Lg0/u;->l(Lg0/u;Lw/x0;Lw/x0$a;)V

    return-void
.end method
