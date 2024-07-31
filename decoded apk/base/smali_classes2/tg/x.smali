.class final Ltg/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[I


# instance fields
.field private final a:Ltg/v;

.field private final b:Ltg/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Ltg/x;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
    .end array-data
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ltg/v;

    invoke-direct {v0}, Ltg/v;-><init>()V

    iput-object v0, p0, Ltg/x;->a:Ltg/v;

    new-instance v0, Ltg/w;

    invoke-direct {v0}, Ltg/w;-><init>()V

    iput-object v0, p0, Ltg/x;->b:Ltg/w;

    return-void
.end method


# virtual methods
.method a(ILkg/a;I)Ldg/q;
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Ltg/x;->c:[I

    invoke-static {p2, p3, v0, v1}, Ltg/y;->n(Lkg/a;IZ[I)[I

    move-result-object p3

    :try_start_0
    iget-object v0, p0, Ltg/x;->b:Ltg/w;

    invoke-virtual {v0, p1, p2, p3}, Ltg/w;->b(ILkg/a;[I)Ldg/q;

    move-result-object p1
    :try_end_0
    .catch Ldg/p; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object v0, p0, Ltg/x;->a:Ltg/v;

    invoke-virtual {v0, p1, p2, p3}, Ltg/v;->b(ILkg/a;[I)Ldg/q;

    move-result-object p1

    return-object p1
.end method
