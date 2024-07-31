.class public final synthetic Lzd/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/a$a;


# instance fields
.field public final synthetic a:Lzd/y2$b;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcc/a$b;


# direct methods
.method public synthetic constructor <init>(Lzd/y2$b;Ljava/lang/String;Lcc/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/z2;->a:Lzd/y2$b;

    iput-object p2, p0, Lzd/z2;->b:Ljava/lang/String;

    iput-object p3, p0, Lzd/z2;->c:Lcc/a$b;

    return-void
.end method


# virtual methods
.method public final a(Lee/b;)V
    .locals 3

    iget-object v0, p0, Lzd/z2;->a:Lzd/y2$b;

    iget-object v1, p0, Lzd/z2;->b:Ljava/lang/String;

    iget-object v2, p0, Lzd/z2;->c:Lcc/a$b;

    invoke-static {v0, v1, v2, p1}, Lzd/y2$b;->b(Lzd/y2$b;Ljava/lang/String;Lcc/a$b;Lee/b;)V

    return-void
.end method
