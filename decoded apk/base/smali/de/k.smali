.class public Lde/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lqd/z;)Lde/a$b;
    .locals 2

    invoke-static {}, Lde/a;->a()Lde/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lqd/z;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lqd/z;->b0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lde/a$b;->b(Ljava/lang/String;)Lde/a$b;

    :cond_0
    return-object v0
.end method

.method private static b(Lqd/z;Lqd/b0;)Lde/a;
    .locals 3

    invoke-static {p0}, Lde/k;->a(Lqd/z;)Lde/a$b;

    move-result-object p0

    invoke-static {}, Lqd/b0;->d0()Lqd/b0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/protobuf/x;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lde/d;->a()Lde/d$b;

    move-result-object v0

    invoke-virtual {p1}, Lqd/b0;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lqd/b0;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/d$b;->b(Ljava/lang/String;)Lde/d$b;

    :cond_0
    invoke-virtual {p1}, Lqd/b0;->f0()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lde/n;->a()Lde/n$b;

    move-result-object v1

    invoke-virtual {p1}, Lqd/b0;->e0()Lqd/g0;

    move-result-object p1

    invoke-virtual {p1}, Lqd/g0;->e0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lqd/g0;->e0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lde/n$b;->c(Ljava/lang/String;)Lde/n$b;

    :cond_1
    invoke-virtual {p1}, Lqd/g0;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lqd/g0;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lde/n$b;->b(Ljava/lang/String;)Lde/n$b;

    :cond_2
    invoke-virtual {v1}, Lde/n$b;->a()Lde/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lde/d$b;->c(Lde/n;)Lde/d$b;

    :cond_3
    invoke-virtual {v0}, Lde/d$b;->a()Lde/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lde/a$b;->c(Lde/d;)Lde/a$b;

    :cond_4
    invoke-virtual {p0}, Lde/a$b;->a()Lde/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lqd/d0;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Lde/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqd/d0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lde/i;"
        }
    .end annotation

    const-string v0, "FirebaseInAppMessaging content cannot be null."

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "FirebaseInAppMessaging campaign id cannot be null."

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "FirebaseInAppMessaging campaign name cannot be null."

    invoke-static {p2, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Decoding message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/protobuf/x;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    new-instance v0, Lde/e;

    invoke-direct {v0, p1, p2, p3}, Lde/e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v1, Lde/k$b;->a:[I

    invoke-virtual {p0}, Lqd/d0;->g0()Lqd/d0$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    new-instance p0, Lde/k$a;

    new-instance v0, Lde/e;

    invoke-direct {v0, p1, p2, p3}, Lde/e;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object p1, Lcom/google/firebase/inappmessaging/model/MessageType;->UNSUPPORTED:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-direct {p0, v0, p1, p4}, Lde/k$a;-><init>(Lde/e;Lcom/google/firebase/inappmessaging/model/MessageType;Ljava/util/Map;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lqd/d0;->d0()Lqd/c0;

    move-result-object p0

    invoke-static {p0}, Lde/k;->f(Lqd/c0;)Lde/f$b;

    move-result-object p0

    invoke-virtual {p0, v0, p4}, Lde/f$b;->a(Lde/e;Ljava/util/Map;)Lde/f;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lqd/d0;->h0()Lqd/f0;

    move-result-object p0

    invoke-static {p0}, Lde/k;->h(Lqd/f0;)Lde/j$b;

    move-result-object p0

    invoke-virtual {p0, v0, p4}, Lde/j$b;->a(Lde/e;Ljava/util/Map;)Lde/j;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lqd/d0;->f0()Lqd/e0;

    move-result-object p0

    invoke-static {p0}, Lde/k;->g(Lqd/e0;)Lde/h$b;

    move-result-object p0

    invoke-virtual {p0, v0, p4}, Lde/h$b;->a(Lde/e;Ljava/util/Map;)Lde/h;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-virtual {p0}, Lqd/d0;->b0()Lqd/a0;

    move-result-object p0

    invoke-static {p0}, Lde/k;->e(Lqd/a0;)Lde/c$b;

    move-result-object p0

    invoke-virtual {p0, v0, p4}, Lde/c$b;->a(Lde/e;Ljava/util/Map;)Lde/c;

    move-result-object p0

    return-object p0
.end method

.method private static d(Lqd/g0;)Lde/n;
    .locals 2

    invoke-static {}, Lde/n;->a()Lde/n$b;

    move-result-object v0

    invoke-virtual {p0}, Lqd/g0;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lqd/g0;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/n$b;->b(Ljava/lang/String;)Lde/n$b;

    :cond_0
    invoke-virtual {p0}, Lqd/g0;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lqd/g0;->e0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lde/n$b;->c(Ljava/lang/String;)Lde/n$b;

    :cond_1
    invoke-virtual {v0}, Lde/n$b;->a()Lde/n;

    move-result-object p0

    return-object p0
.end method

.method private static e(Lqd/a0;)Lde/c$b;
    .locals 3

    invoke-static {}, Lde/c;->d()Lde/c$b;

    move-result-object v0

    invoke-virtual {p0}, Lqd/a0;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lqd/a0;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/c$b;->c(Ljava/lang/String;)Lde/c$b;

    :cond_0
    invoke-virtual {p0}, Lqd/a0;->g0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lde/g;->a()Lde/g$a;

    move-result-object v1

    invoke-virtual {p0}, Lqd/a0;->g0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lde/g$a;->b(Ljava/lang/String;)Lde/g$a;

    move-result-object v1

    invoke-virtual {v1}, Lde/g$a;->a()Lde/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/c$b;->e(Lde/g;)Lde/c$b;

    :cond_1
    invoke-virtual {p0}, Lqd/a0;->i0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lqd/a0;->b0()Lqd/z;

    move-result-object v1

    invoke-static {v1}, Lde/k;->a(Lqd/z;)Lde/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lde/a$b;->a()Lde/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/c$b;->b(Lde/a;)Lde/c$b;

    :cond_2
    invoke-virtual {p0}, Lqd/a0;->j0()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lqd/a0;->e0()Lqd/g0;

    move-result-object v1

    invoke-static {v1}, Lde/k;->d(Lqd/g0;)Lde/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/c$b;->d(Lde/n;)Lde/c$b;

    :cond_3
    invoke-virtual {p0}, Lqd/a0;->k0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lqd/a0;->h0()Lqd/g0;

    move-result-object p0

    invoke-static {p0}, Lde/k;->d(Lqd/g0;)Lde/n;

    move-result-object p0

    invoke-virtual {v0, p0}, Lde/c$b;->f(Lde/n;)Lde/c$b;

    :cond_4
    return-object v0
.end method

.method private static f(Lqd/c0;)Lde/f$b;
    .locals 3

    invoke-static {}, Lde/f;->d()Lde/f$b;

    move-result-object v0

    invoke-virtual {p0}, Lqd/c0;->r0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lqd/c0;->l0()Lqd/g0;

    move-result-object v1

    invoke-static {v1}, Lde/k;->d(Lqd/g0;)Lde/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/f$b;->h(Lde/n;)Lde/f$b;

    :cond_0
    invoke-virtual {p0}, Lqd/c0;->m0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lqd/c0;->d0()Lqd/g0;

    move-result-object v1

    invoke-static {v1}, Lde/k;->d(Lqd/g0;)Lde/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/f$b;->c(Lde/n;)Lde/f$b;

    :cond_1
    invoke-virtual {p0}, Lqd/c0;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lqd/c0;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/f$b;->b(Ljava/lang/String;)Lde/f$b;

    :cond_2
    invoke-virtual {p0}, Lqd/c0;->n0()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lqd/c0;->o0()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    invoke-virtual {p0}, Lqd/c0;->h0()Lqd/z;

    move-result-object v1

    invoke-virtual {p0}, Lqd/c0;->i0()Lqd/b0;

    move-result-object v2

    invoke-static {v1, v2}, Lde/k;->b(Lqd/z;Lqd/b0;)Lde/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/f$b;->f(Lde/a;)Lde/f$b;

    :cond_4
    invoke-virtual {p0}, Lqd/c0;->p0()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lqd/c0;->q0()Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    invoke-virtual {p0}, Lqd/c0;->j0()Lqd/z;

    move-result-object v1

    invoke-virtual {p0}, Lqd/c0;->k0()Lqd/b0;

    move-result-object v2

    invoke-static {v1, v2}, Lde/k;->b(Lqd/z;Lqd/b0;)Lde/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/f$b;->g(Lde/a;)Lde/f$b;

    :cond_6
    invoke-virtual {p0}, Lqd/c0;->g0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {}, Lde/g;->a()Lde/g$a;

    move-result-object v1

    invoke-virtual {p0}, Lqd/c0;->g0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lde/g$a;->b(Ljava/lang/String;)Lde/g$a;

    move-result-object v1

    invoke-virtual {v1}, Lde/g$a;->a()Lde/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/f$b;->e(Lde/g;)Lde/f$b;

    :cond_7
    invoke-virtual {p0}, Lqd/c0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-static {}, Lde/g;->a()Lde/g$a;

    move-result-object v1

    invoke-virtual {p0}, Lqd/c0;->f0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lde/g$a;->b(Ljava/lang/String;)Lde/g$a;

    move-result-object p0

    invoke-virtual {p0}, Lde/g$a;->a()Lde/g;

    move-result-object p0

    invoke-virtual {v0, p0}, Lde/f$b;->d(Lde/g;)Lde/f$b;

    :cond_8
    return-object v0
.end method

.method private static g(Lqd/e0;)Lde/h$b;
    .locals 3

    invoke-static {}, Lde/h;->d()Lde/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lqd/e0;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lde/g;->a()Lde/g$a;

    move-result-object v1

    invoke-virtual {p0}, Lqd/e0;->e0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lde/g$a;->b(Ljava/lang/String;)Lde/g$a;

    move-result-object v1

    invoke-virtual {v1}, Lde/g$a;->a()Lde/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/h$b;->c(Lde/g;)Lde/h$b;

    :cond_0
    invoke-virtual {p0}, Lqd/e0;->f0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lqd/e0;->b0()Lqd/z;

    move-result-object p0

    invoke-static {p0}, Lde/k;->a(Lqd/z;)Lde/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lde/a$b;->a()Lde/a;

    move-result-object p0

    invoke-virtual {v0, p0}, Lde/h$b;->b(Lde/a;)Lde/h$b;

    :cond_1
    return-object v0
.end method

.method private static h(Lqd/f0;)Lde/j$b;
    .locals 3

    invoke-static {}, Lde/j;->d()Lde/j$b;

    move-result-object v0

    invoke-virtual {p0}, Lqd/f0;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lqd/f0;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/j$b;->c(Ljava/lang/String;)Lde/j$b;

    :cond_0
    invoke-virtual {p0}, Lqd/f0;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lde/g;->a()Lde/g$a;

    move-result-object v1

    invoke-virtual {p0}, Lqd/f0;->h0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lde/g$a;->b(Ljava/lang/String;)Lde/g$a;

    move-result-object v1

    invoke-virtual {v1}, Lde/g$a;->a()Lde/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/j$b;->e(Lde/g;)Lde/j$b;

    :cond_1
    invoke-virtual {p0}, Lqd/f0;->j0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lqd/f0;->b0()Lqd/z;

    move-result-object v1

    invoke-virtual {p0}, Lqd/f0;->d0()Lqd/b0;

    move-result-object v2

    invoke-static {v1, v2}, Lde/k;->b(Lqd/z;Lqd/b0;)Lde/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/j$b;->b(Lde/a;)Lde/j$b;

    :cond_2
    invoke-virtual {p0}, Lqd/f0;->k0()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lqd/f0;->f0()Lqd/g0;

    move-result-object v1

    invoke-static {v1}, Lde/k;->d(Lqd/g0;)Lde/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/j$b;->d(Lde/n;)Lde/j$b;

    :cond_3
    invoke-virtual {p0}, Lqd/f0;->l0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lqd/f0;->i0()Lqd/g0;

    move-result-object p0

    invoke-static {p0}, Lde/k;->d(Lqd/g0;)Lde/n;

    move-result-object p0

    invoke-virtual {v0, p0}, Lde/j$b;->f(Lde/n;)Lde/j$b;

    :cond_4
    return-object v0
.end method
