.class public final synthetic Lzd/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/i2;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljj/e;

.field public final synthetic d:Ljj/e;

.field public final synthetic e:Ljj/e;


# direct methods
.method public synthetic constructor <init>(Lzd/i2;Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/g2;->a:Lzd/i2;

    iput-object p2, p0, Lzd/g2;->b:Ljava/lang/String;

    iput-object p3, p0, Lzd/g2;->c:Ljj/e;

    iput-object p4, p0, Lzd/g2;->d:Ljj/e;

    iput-object p5, p0, Lzd/g2;->e:Ljj/e;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lzd/g2;->a:Lzd/i2;

    iget-object v1, p0, Lzd/g2;->b:Ljava/lang/String;

    iget-object v2, p0, Lzd/g2;->c:Ljj/e;

    iget-object v3, p0, Lzd/g2;->d:Ljj/e;

    iget-object v4, p0, Lzd/g2;->e:Ljj/e;

    move-object v5, p1

    check-cast v5, Lpf/e;

    invoke-static/range {v0 .. v5}, Lzd/i2;->h(Lzd/i2;Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;Lpf/e;)Ldj/j;

    move-result-object p1

    return-object p1
.end method
