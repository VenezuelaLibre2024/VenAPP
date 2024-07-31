.class public final synthetic Lu6/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/r$a;


# instance fields
.field public final synthetic a:Lu6/b$a;

.field public final synthetic b:Lv7/u;

.field public final synthetic c:Lv7/x;


# direct methods
.method public synthetic constructor <init>(Lu6/b$a;Lv7/u;Lv7/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/r0;->a:Lu6/b$a;

    iput-object p2, p0, Lu6/r0;->b:Lv7/u;

    iput-object p3, p0, Lu6/r0;->c:Lv7/x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lu6/r0;->a:Lu6/b$a;

    iget-object v1, p0, Lu6/r0;->b:Lv7/u;

    iget-object v2, p0, Lu6/r0;->c:Lv7/x;

    check-cast p1, Lu6/b;

    invoke-static {v0, v1, v2, p1}, Lu6/n1;->G0(Lu6/b$a;Lv7/u;Lv7/x;Lu6/b;)V

    return-void
.end method
