.class public final Ltl/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltl/b$b;,
        Ltl/b$a;
    }
.end annotation


# static fields
.field public static final c:Ltl/b$a;


# instance fields
.field private final a:Lql/a0;

.field private final b:Lql/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltl/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltl/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ltl/b;->c:Ltl/b$a;

    return-void
.end method

.method public constructor <init>(Lql/a0;Lql/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/b;->a:Lql/a0;

    iput-object p2, p0, Ltl/b;->b:Lql/c0;

    return-void
.end method


# virtual methods
.method public final a()Lql/c0;
    .locals 1

    iget-object v0, p0, Ltl/b;->b:Lql/c0;

    return-object v0
.end method

.method public final b()Lql/a0;
    .locals 1

    iget-object v0, p0, Ltl/b;->a:Lql/a0;

    return-object v0
.end method
